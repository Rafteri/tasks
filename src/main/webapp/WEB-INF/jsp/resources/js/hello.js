function init() {
    var arrColors = ["red", "blue", "green", "darkblue", "orange", "aqua", "violet", "black", "white"];
    var i = 0;
    var elem = document.getElementById("name");
    elem.addEventListener("click", function () {
        if (i == arrColors.length - 1) {
            i = 0;
        }
        elem.style.color = arrColors[i];
        i++;
    });
}
window.onload = init;