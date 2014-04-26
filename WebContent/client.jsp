<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>STE DE PRODUITS PHARMACEUTIQUE</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
</head>

<body id="page1">
<div class="body1">
  <div class="body2">
    <div class="main">
      <!-- header -->
      <header>
        <h1><a href="index.html" id="logo"></a></h1>
      </header> 
      <!-- / header -->
      <!-- content -->
      <section id="content"> 
       
       
      
      
       <br><br><br><br><br><br><br>
<span class="titrerbq">Recherche des produits</span>

<table border="0" width="100%">
            <input type="hidden" name="catprd" value="M" />
            <tr>
            	 <td><br />  <span class="taille2"> produit:</span>  </td>
                <td>
                <br /><input type="text" name="produit" id="produit" />
                 </td>
            </tr>
          
 <tr>
            	<td nowrap><br />  <span class="taille2">Laboratoire :</span> </td>
                <td><br />
                	<select name="labo" id="labo">
                    	<option value=""> - Choisir&nbsp;Laboratoire - </option>
                        <option value="1001">A.BAILLY-CREAT</option><option value="0181">A.P.M JORDANIE (ADVENCED)</option><option value="1002">ABBOTT INTERNATIONAL</option>

</select>
</td>
</tr>



<tr>
<td ><br />  <span class="taille2">DCI :</span> </td>
                <td><br />
                	<select name="dci" id="dci">
                    	<option value=""> - Choisir DCI - </option>
						<option value="AA   6">ACEPROMAZINE</option><option value="AB  17">ACIDE ACETYLSALICYLIQUE (ACETYLSALICYLATE DE CALCIUM UREE)</option>


</select>
</td>
</tr>
 <tr>            
            	<td colspan="2" align="right"><hr /></td>
            </tr>


           
           <tr>
            
            	<td colspan="2" align="right"><input id="rechercher" type="submit" value="Rechercher" class="bouton" /></td>
            	
            </tr>

</table>
	      
            </section>
      
      
      <!-- / content -->
      <!-- footer -->
      <footer>
        <div class="wrapper">
          <ul id="icons">
            <li><a href="#" class="normaltip"><img src="images/icon1.png" alt=""></a></li>
            <li><a href="#" class="normaltip"><img src="images/icon4.png" alt=""></a></li>
            <li><a href="#" class="normaltip"><img src="images/icon5.png" alt=""></a></li>
           
          </ul>
        </div>
        Copyright &copy; <a >2014</a> All Rights Reserved<br>
        </footer>
      <!-- / footer -->
    </div>
  </div>
</div>


</body>
</html>