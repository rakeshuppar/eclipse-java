<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Residential Building Form</title>
<link rel="stylesheet" href="first.css">
</head>
<body>

<form action="build" method="post">
<h1> Residential Building Design Details</h1>
<pre>
1.Building type            :<input type="text" name='type'>
2.Road                     :<input type="text" name='landmark'>
3.Area                     :<input type="text" name='area'>
4.City                     :<input type="text" name='city'>
5.HouseNumber              :<input type="number" name='housenumber'>
6.Owner Name               :<input type="text" name='owner'>
7.Floors                   :<input type="number" name='floor'>
8.Rooms                    :<input type="number" name='room'>
9.Windows                  :<input type="number" name='window'>
10.Gate                    :<input type="number" name='gate'>
11.Engineer                :<input type="text" name='engineer'>
12.House Name              :<input type="text" name='name'>
13.Number Pillars          :<input type="number" name='pillers'>
14.Column Depth            :<input type="text" name='cdepth'>
15.Column Width            :<input type="text" name='cwidth'>
16.Slab Thickness          :<input type="text" name='thickness'>
17.Building Area           :<input type="text" name='areas'>
18.Cement                  :<input type="text" name='cement'>
19.Steel                   :<input type="text" name='steel'>
20.Sand                    :<input type="text" name='sand'>
21.BrickType               :<input type="text" name='bricks'>
22.Concrete Grade          :<input type="text" name='cgrade'>
23.Steel Grade             :<input type="text" name='sgrade'>
24.Total Cost              :<input type="text" name='cost'>
25.Footing Type            :<input type="text" name='footing'>
26.BrickMasonaryType       :<input type="text" name='brick'>
27.Door Material           :<input type="text" name='door'>
28.StaircaseType           :<input type="text" name='stair'>
29.Risers                  :<input type="number" name='risers'>
30.Treads                  :<input type="number" name='tread'>
31.Number of Steps         :<input type="number" name='steps'>
32.Width of Landings       :<input type="text" name='landing'>
33.Soil Type               :<input type="text" name='soil'>
34.Bearing Pressure        :<input type="text" name='bearing'>
35.Footing Thickness       :<input type="text" name='thick'>
36.Plinth Beam Size        :<input type="text" name='plinth'>
37.Thickness Wall          :<input type="text" name='wall'>
38.SlabType                :<input type="text" name='slab'>
39.TileType                :<input type="text" name='tile'>
40.Plastering Thickness    :<input type="text" name='plastering'>
41.Coarse Aggregate Size   :<input type="text" name='coarse'>
42.Fine Aggregate Size     :<input type="text" name='fine'>
43.Wall Color              :<input type="color" name='colors'>
44.Number of ElectricBoard :<input type="number" name='board'>
45.Floor Height            :<input type="text" name='fheight'>
46.Beam Width              :<input type="text" name='bwidth'>
47.Beam length             :<input type="text" name='blength'>
48.Slab Short Span         :<input type="text" name='short'>
49.Slab Long Span          :<input type="text" name='long'>
50.Shear WallThickness     :<input type="text" name='shear'>
51.Lintel Thickness        :<input type="text" name='lintel'>
52.Lintel Height           :<input type="text" name='lheight'>
53.Door Width              :<input type="text" name='dwidth'>
54.Door Height             :<input type="text" name='dheight'>
55.Sill Height             :<input type="text" name='sill'>
56.Snow Load               :<input type="text" name='snow'>
57.Dead Load               :<input type="text" name='dead'>
58.Live Load               :<input type="text" name='live'>
59.Floor Finish            :<input type="text" name='floor'>
60.Water Proofing          :<input type="text" name='proof'>
61.Foundation Depth        :<input type="text" name='fdepth'>
62.Parapet Height          :<input type="text" name='pheight'>
63.Number People           :<input type="number" name='people'>
64.Start Date              :<input type="date" name='start'>
65.Complete Date           :<input type="date" name='complete'>

<input type="submit" value="send">
</pre>
</form>
</body>
</html>