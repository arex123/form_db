<html>
<style>
    .cont{
        padding: 20px;
        margin-left: 350px;
        margin-top: 100px;
        width: 500px;
        background-color: #cddcdc;

    }
    .heading{
        text-align: center;
    }

    label{
        margin: 5px;
        width:180px;
        clear:left;
        text-align:right;
        padding-right:10px;
    }

    .opt{
        float: left;
    }



    input, label {
        float:left;
    }

    a{
        color:blue;
        text-decoration: none;
        text-align: center;

    }
    p{
        text-align:center;
    }

</style>
<body>

<div class="cont">

<form action="registerUser" method="post">
    <h2 class="heading">Form</h2>

    <label>Enter name:</label> <input type="text" name="name"><br>
    <label>Enter email:</label> <input type="email" name="email"><br>
    <label>course:</label> <select name="course" class="opt">
                                <option value="btech">BTECH</option>
                                <option value="mca">BCA+MCA</option>
                                <option value="bca">BCA</option>
                            </select><br>

    <label>  Enter password:    </label>  <input type="password" name="password" id="ps1"><br>
    <label>  Confirm password:  </label>   <input type="password" name="cpassword" id="ps2"><br>

    <label><a>Agree</a></label> <input type="checkbox" name="terms" value="checked"><br><br><br><br>

    <button type="submit">Submit</button>
</form>
    <p><a href="http://localhost:8080/webtest/showdata">SHOW ALL USERS</a></p>

</div>

<script>






</script>

</body>
</html>
