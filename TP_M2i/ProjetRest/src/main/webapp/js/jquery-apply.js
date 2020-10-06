$(function(e){
	setInterval(afficheHeure,1000)
	afficheHeure();
	
	appelWSHelloBase();
	appelWSHelloBzh();
	appelWSHelloTours();

	
});




function remplirDiv(){
	$("#heure").html("coucou");
}
function rafraichirHeure(data){
	$("#heure").html(data)
}
function afficheHeure(){
	$.get("http://localhost:8080/ProjetRest/rs/heure", false,
			rafraichirHeure, 'text');
}
function rafraichirHBase(data){
	$("#HBase").html(data)
}
function appelWSHelloBase(){
	$.get("http://localhost:8080/ProjetRest/rs/hello", false,
			rafraichirHBase, 'text');
}
function rafraichirHBzh(data){
	$("#HBzh").html(data)
}
function appelWSHelloBzh(){
	$.get("http://localhost:8080/ProjetRest/rs/hello/bzh", false,
			rafraichirHBzh, 'text');
}
function rafraichirHTours(data){
	$("#HTours").html(data)
}
function appelWSHelloTours(){
	$.get("http://localhost:8080/ProjetRest/rs/hello/tours", false,
			rafraichirHTours, 'text');
}





