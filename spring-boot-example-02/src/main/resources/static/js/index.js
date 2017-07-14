$(document).ready(function(){
    showList();
    $('#submitForm').on('click', handleSubmitForm);
    $('#updateView').on('click', showList);
    $('#clean').on('click', handleClean);
});

// ajax get list and show
var showList = function(){
    $.get("/list", function(data){
        var beanList = "";
        data.forEach(function(obj) {
            beanList += "name=" + obj.name + ", age=" + obj.age + "<br>";
        })
        $('#listView').html(beanList);
    });
};

//ajax send form, then show list
var handleSubmitForm = function() {
    var name = $('#name').val();
    var age = $('#age').val();
    
    $.ajax({
        method: "POST",
        url: "/add",
        data: {
            "name" : name, 
            "age": age
        },
        success: function(rep) {
            if (rep.status !== 'success') {
                alert("Error!");
                return;
            }
            showList();
        }
    });
};

// ajax call clean, then show list
var handleClean = function(){
    $.ajax({
        method: "GET",
        url: "/clean",
        success: function(rep) {
            if (rep.status !== 'success') {
                alert("Error!");
                return;
            }
            showList();
        }
    });
};