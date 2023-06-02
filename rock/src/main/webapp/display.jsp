<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Residential Building Details</title>
<link rel="stylesheet" href="details.css">
</head>
<body>

<h1>Do Post method is success</h1>

<pre>
Building type:<%=request.getParameter("type") %>
Road:<%=request.getParameter("landmark") %>
Area:<%=request.getParameter("area") %>
City<%=request.getParameter("city") %>
HouseNumber <%=request.getParameter("housenumber") %>
Owner Name <%=request.getParameter("owner") %>
Floors<%=request.getParameter("floor") %>
Rooms <%=request.getParameter("room") %>
Windows<%=request.getParameter("window") %>
Gate<%=request.getParameter("gate") %>
Engineer<%=request.getParameter("engineer") %>
House Name<%=request.getParameter("name") %>
Number Pillars<%=request.getParameter("pillers") %>
Column Depth<%=request.getParameter("cdepth") %>
Column Width <%=request.getParameter("cwidth") %>
Slab Thickness<%=request.getParameter("thickness") %>
Building Area<%=request.getParameter("areas") %>
Cement<%=request.getParameter("cement") %>
Steel<%=request.getParameter("steel") %>
Sand<%=request.getParameter("sand") %>
BrickType<%=request.getParameter("bricks") %>
Concrete Grade<%=request.getParameter("cgrade") %>
Steel Grade<%=request.getParameter("sgrade") %>
Total Cost<%=request.getParameter("cost") %>
Footing Type<%=request.getParameter("footing") %>
BrickMasonaryType<%=request.getParameter("brick") %>
Door Material<%=request.getParameter("door") %>
StaircaseType<%=request.getParameter("stair") %>
Risers<%=request.getParameter("risers") %>
Treads <%=request.getParameter("tread") %>
Number of Steps<%=request.getParameter("steps") %>
Width of Landings<%=request.getParameter("landing") %>
Soil Type <%=request.getParameter("soil") %>
Bearing Pressure<%=request.getParameter("bearing") %>
Footing Thickness<%=request.getParameter("thick") %>
Plinth Beam Size<%=request.getParameter("plinth") %>
Thickness Wall<%=request.getParameter("wall") %>
SlabType<%=request.getParameter("slab") %>
TileType<%=request.getParameter("tile") %>
Plastering Thickness<%=request.getParameter("plastering") %>
Coarse Aggregate Size <%=request.getParameter("coarse") %>
Fine Aggregate Size<%=request.getParameter("fine") %>
Wall Color<%=request.getParameter("colors") %>
Number of ElectricBoard<%=request.getParameter("board") %>
Floor Height<%=request.getParameter("fheight") %>
Beam Width<%=request.getParameter("bwidth") %>
Beam length<%=request.getParameter("blength") %>
Slab Short Span<%=request.getParameter("short") %>
Slab Long Span<%=request.getParameter("long") %>
Shear WallThickness<%=request.getParameter("shear") %>
Lintel Thickness<%=request.getParameter("lintel") %>
Lintel Height<%=request.getParameter("lheight") %>
Door Width<%=request.getParameter("dwidth") %>
Door Height<%=request.getParameter("dheight") %>
Sill Height<%=request.getParameter("sill") %>
Snow Load<%=request.getParameter("snow") %>
Snow Load<%=request.getParameter("dead") %>
Snow Load<%=request.getParameter("live") %>
Floor Finish<%=request.getParameter("floor") %>
Water Proofing<%=request.getParameter("proof") %>
Foundation Depth<%=request.getParameter("fdepth") %>
Parapet Height<%=request.getParameter("pheight") %>
Number People<%=request.getParameter("people") %>
Start Date<%=request.getParameter("start") %>
Complete Date<%=request.getParameter("complete") %>
</pre>
</body>
</html>