
function validationForm() {
		var name = document.getElementById("name").value;


		if (name == "") {
			// 			alert("Enter the Name");
			document.getElementById("name2").innerHTML = "* Enter the Name";
			return false;
		}
		if (name.length < 3) {
			// 			alert("Name must be at least 3 char");
			document.getElementById("name2").innerHTML = "* Name should have at least 3 letters";
			return false;
			}
			}