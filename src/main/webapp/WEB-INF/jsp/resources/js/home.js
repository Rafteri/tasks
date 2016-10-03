function isExists(value) {
    var xhr = new XMLHttpRequest();
    var elem = document.getElementById("error-message");
    xhr.onreadystatechange = handler;
    xhr.open("GET", "/check?name=" + value, true);
    xhr.send();

    function handler() {
        if (xhr.readyState === XMLHttpRequest.DONE) {
            if (xhr.status === 200) {
                var data = JSON.parse(xhr.responseText);
                if (!data["is-exists"]) {
                    elem.classList.add("hidden");
                } else {
                    elem.classList.remove("hidden");
                }
            }
        }

    };
};

