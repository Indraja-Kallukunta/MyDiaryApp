<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
 <head>
  <link  rel="stylesheet" href="/css/stylenew3.css" />
</head>
    <body class="page">
         <div class="smallimage"><img src="/images/smallbook3.png"  /></div>
         <div class="text">MyDiaryApp</div><br/><br/>
         <div class="line"></div>
		 <div class="welcome">welcome ${users.username}</div>
		 <div class="signout"><a href="/signout"><button type="button">signout</button></a></div>
         <div class="bigbook"><img src="images/smallbook1.png"  /></div>
          <div class="form">
			    <form method="get">
                <h3 style="text-align:center;">View Entry</h3>
              <label>Date : </label>   <input type="text" name="entrydate"  value="<fmt:formatDate value="${entry.entrydate}" pattern="dd-MM-yyyy"/>" readonly/>   <br/><br/>      
              <label>Description : </label>   <textarea  rows="5" cols="10" name="description" readonly>${entry.description}</textarea> <br/><br/>   
              <a href="/userhome"><button type="button" class="button">Back To Home</button></a><br/>
			  
			  </form>
			 
       </div>

</body>