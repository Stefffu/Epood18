
var counter = 3;
var toolcontainer = document.getElementById("tools");
var btn = document.getElementById("btn");

btn.addEventListener("click", function(){
    var ourRequest = new XMLHttpRequest();
    ourRequest.open('GET', 'https://api.myjson.com/bins/193zkn');
    ourRequest.onload = function(){
        var ourData = JSON.parse(ourRequest.responseText);
        renderHTML(ourData);
    };
    ourRequest.send();
    pageCounter++;
});

function renderHTML(data){
    var htmlString = "";

    for (i=counter-3; i < data.length; i++) {
        if (i < counter) {
            htmlString += "<p>" + data[i].vahend + " mis on " + data[i].liik + " maksab " + data[i].hind + " eurot.";
        }
    }
    counter=counter+3;

    toolcontainer.insertAdjacentHTML('beforeend', htmlString);
}

