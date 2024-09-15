Halo Readers,

Repository ini adalah tempat sebagai hasil training tentang automation testing menggunakan Katalon Studio v9.6.0.
Dalam Repo ini mengandung tiga tipe testing yaitu pada Website, Mobile dan API.
Enjoy ...🍻🍻🍻

Untuk penjelasan pertama automation pada project web:
Test case:
Folder:
Website
|-Negative Scenario:
|  1.Login dengan akun tidak terdaftar, user melakukan login dengan akun tidak terdaftar dimana credential didapat dari data test file excel
|  2.login tanpa email, user melakukan login dengan akun tidak terdaftar dimana credential didapat dari data test file excel
|  3.login tanpa password, user melakukan login dengan akun tidak terdaftar dimana credential didapat dari data test file excel
|-Positive Scenario:
|  1.Akses halaman juice shop, user mengakses halaman website juice shop
|  2.login dengan akun terdaftar, user dengan precondition sudah berada pada halaman beranda juice shop lalu melakukan login yang dimana data credentioal didapat dari data test file excel
|    pada test case ini terdapat kondisi berupa if statement jika login salah, maka clear textbox email dan password lalu gantikan dengan credential yang benar
|    dilanjutkan ketika sudah berhasil login lalu logout.
|  3.Register user, user melakukan daftar pada website juice shop dimana credential didapat dari data test file excel
