package form;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class registerUser extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String cpassword = req.getParameter("cpassword");

        String course = req.getParameter("course");

        String ConditionAgreed = req.getParameter("terms");


//      validation
        if(ConditionAgreed!=null){
            System.out.println("checked\n");
        }
        else{
            out.println("<h2>you must agree to terms and conditions<h2>");
            return;
        }

        if(!password.equals(cpassword)){
            out.print("password mush match");
            return;
        }


        System.out.println("name: "+name+" email: "+email);

        res.setContentType("text/html");


        boolean flag = false;

        try{
            Connection con = db.createC();
            String q = "insert into ad1(name,email,course,password) values(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,course);
            ps.setString(4,password);  //pending make this hash

            ps.executeUpdate();
            flag=true;

        }catch (Exception e){
            e.printStackTrace();
        }

        if(flag){
//            out.print("successfully added");

         res.sendRedirect("success.jsp");


        }else{
            out.print("something went wrong");
        }






    }
}
