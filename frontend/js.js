const createurl = ('localhost:8005/create');
 // Call the fetch function passing the url of the API as a parameter
const data = {
    "product_name": this.saleName.value,
    "quantity": this.saleQuatity.value,
    "price": this.salePrice.value
}

 fetch (createurl, {
    method: "POST",
    headers: {
        'Content-Type': 'application/json',
    },
    body: JSON.stringify(data),
})
.then(response=> response.json())
.then (funtion(data){
    console.log("Request succeded with JSON response", data),
}) 
.catch(funtion() {
// This is where you run code if the server returns any errors
console.log("Try again", error),
});