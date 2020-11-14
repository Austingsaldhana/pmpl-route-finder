
<html>
    <title>PMPML HOMEPAGE</title>
    <head>
    <style>
    .mySlides {display:none;}
    
    ul {
        list-style-type: none;
        margin: 0;
        padding: 0;
        overflow: hidden;
        background-color: #356;
    }
    
    li {
        float: left;
    }
    
    li a {
        display: block;
        color: yellow;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
    }
    
    li a:hover:not(.active) {
        background-color: #222;
    }
    
    .active {
        background-color: #4CAF50;
    }
    .fieldset2{
    background-image: url(s1.jpg);
     background-color:#848484;
     color: #bad1db;
     border-color:GREEN;
      border-style: solid;
    }
    
    w3-section
    {
        margin-top:16px!important;
    margin-bottom:16px!important;
    }
    
    w3-content{
        max-width:980px;
    margin:auto;
    }
    </style>
    </head>
    
    <body>
    <fieldset class="fieldset2">;
    <img src=1.png height=150px width=250px/>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    <font face="Copperplate Gothic Bold" size=10 color="red"><u><i> PMPML</u> <u>ROUTE</u> <u>FINDER</u></i> 
     &nbsp; &nbsp;	&nbsp;	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  </font><img src=2.png height=150px width=250px/>
    </fieldset>
    <br><br>
    
    <ul>
      <li><a href="main.html">Home </a></li> &nbsp; &nbsp; 
      <li><a href="ser1.html">SERVICES</a> </li>
      <li><a href="about.html">ABOUT US</a></li>
      <li><a href="feedback.html">FEEDBACK</a></li>
      <li><a href="admin.html">ADMIN</a></li>
    
    </ul>
    <br><br><br>
    <div id="container">
    <div id="contheader">
    </div>
    <b>Welcome to PMPML Route Finder<br>
    Route Finder aims to organize your program strategically so that it can be organised, perfect and cost effective.<br>
    "PMPML is committed to provide access through transport in a manner that is safe, secure, affordable, accessible, efficient reliable and resilient,
     which will reduce carbon footprint & promote sustainable development".<br>
    Pune Nagarpalika, in its new Avatar as Pune Municipal Corporation, took charge of the bus service in 1950.
     Pune Municipal Transport (PMT) was thus started in compliance with the BPMC Act of 1949. <br>
     The number of buses now stood at 57 and they were plying across 14 routes. By 1960, these figures had gone further up.<br>
    <br>
    </div>
    <div class="w3-content w3-section" style="max-width:350px">
      <img class="mySlides" src="img\b.jpg" style="width:300%">
      <img class="mySlides" src="img\b2.jpg" style="width:300%">
      <img class="mySlides" src="img\b3.jpg" style="width:300%">
       <img class="mySlides" src="img\b4.jpg" style="width:300%">
      <img class="mySlides" src="img\b5.jpg" style="width:300%">
      <img class="mySlides" src="img\b6.jpg" style="width:300%">  
    </div>
    
    <script>
    var myIndex = 0;
    carousel();
    
    function carousel() {
        var i;
        var x = document.getElementsByClassName("mySlides");
        for (i = 0; i < x.length; i++) {
           x[i].style.display = "none";  
        }
        myIndex++;
        if (myIndex > x.length) {myIndex = 1}    
        x[myIndex-1].style.display = "block";  
        setTimeout(carousel, 2000); // Change image every 2 seconds
    }
    </script>
    </body>
    </html>
    
    