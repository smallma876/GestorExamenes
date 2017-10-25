document.getElementById("divMensajeBloqMayus").style.display="none";

function isMayus(input){
	kCode=input.keyCode?input.keyCode:input.which;
	sKey=input.shiftKey?input.shiftKey:((kCode==16)?true:false);
	if(((kCode>=65&&kCode<=90)&&!sKey)||((kCode>=97&&kCode<=122)&&sKey ))
		document.getElementById("divMensajeBloqMayus").style.display="block";
		
	
	}

function MayusAct(event){
	
}