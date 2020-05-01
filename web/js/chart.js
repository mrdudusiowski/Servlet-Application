var socket = new WebSocket("wss://localhost:8443/data");
socket.onmessage = onMessage;
var ctx = document.getElementById('myChart').getContext('2d');
var chart = new Chart(ctx, {
        type: 'line',
        data: {
            labels: [''],
            datasets: [{
                label: 'Random values',
                backgroundColor: 'rgb(255, 203, 99)',
                borderColor: 'rgb(255, 203, 99)',
                data: [1]
            }]
        },
        options: {
            responsive: true
        }
    });
function onMessage(event) {
    var message = JSON.parse(event.data);
    console.log(message.chartData);
    
    chart.data.datasets[0].data = message.chartData;
    chart.update();
}