
function valid(){
	
	var names;
	
	names=document.new.name.value;
	names=document.getElementById('name').value;
	
	if(names==''){
		 alert("name should not be empty")
		document.getElementById("fname").innerHTML="name should not be empty";
       
	}else if(names.length<3){
		alert("name length should greater than 3")
		document.getElementById("fname").innerHTML="name length should greater than 3";
		
		return false;
	}
	
	
}