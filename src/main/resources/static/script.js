const API_URL = "http://localhost:8094/products";

const form = document.getElementById('productForm');
const tableBody = document.getElementById('productTableBody');

// Handle form submission for Create and Update
form.addEventListener('submit', async (e) => {
  e.preventDefault();

  const id = document.getElementById('productId').value;
  const data = {
    name: document.getElementById('name').value,
    price: parseFloat(document.getElementById('price').value),
    quantity: parseInt(document.getElementById('quantity').value)
  };

  try {
    if (id) {
      // Update product
      await fetch(`${API_URL}/${id}`, {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data)
      });
    } else {
      // Create new product
      await fetch(API_URL, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data)
      });
    }

    form.reset();
    loadProducts();
  } catch (err) {
    console.error("Error submitting product:", err);
  }
});

// Fetch and display all products
async function loadProducts() {
  try {
    const res = await fetch(API_URL);
    const products = await res.json();

    tableBody.innerHTML = "";

    products.forEach(p => {
      const row = `<tr>
        <td>${p.id}</td>
        <td>${p.name}</td>
        <td>${p.price}</td>
        <td>${p.quantity}</td>
        <td>
          <button class="btn btn-sm btn-warning" onclick="editProduct(${p.id}, '${p.name}', ${p.price}, ${p.quantity})">Edit</button>
          <button class="btn btn-sm btn-danger" onclick="deleteProduct(${p.id})">Delete</button>
        </td>
      </tr>`;
      tableBody.innerHTML += row;
    });
  } catch (err) {
    console.error("Error loading products:", err);
  }
}

// Populate form fields for editing
function editProduct(id, name, price, quantity) {
  document.getElementById('productId').value = id;
  document.getElementById('name').value = name;
  document.getElementById('price').value = price;
  document.getElementById('quantity').value = quantity;
}

// Delete product
async function deleteProduct(id) {
  try {
    await fetch(`${API_URL}/${id}`, {
      method: 'DELETE'
    });
    loadProducts();
  } catch (err) {
    console.error("Error deleting product:", err);
  }
}

// Initial load
loadProducts();
