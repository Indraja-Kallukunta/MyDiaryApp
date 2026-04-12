<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
 <head>
  <link  rel="stylesheet" href="css/stylenew.css" />
</head>
    <body class="page">
         <div class="smallimage"><img src="images/smallbook3.png"  /></div>
         <div class="text">MyDiaryApp</div><br/><br/>
         <div class="line"></div>
         <div class="bigbook"><img src="images/smallbook1.png"  /></div>
          <div class="form">
			    <form action="./loginuser" method="post">
                <h3 style="text-align:center;">Login Here</h3>
              <label>Username : </label>   <input type="text" name="username"/>   <br/><br/>      
              <label>Password : </label>   <input type="password" name="password"/> <br/><br/>   
              <button type="submit" class="button">Login</button><br/>
			  
			  </form>
			  New User?<a href="register">register </a>here
       </div>

</body>
</html>