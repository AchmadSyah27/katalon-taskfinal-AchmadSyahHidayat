# 🧪 Katalon Web Automation Portfolio

![Katalon Studio](https://img.shields.io/badge/Katalon_Studio-10.1-blue?logo=katalon&logoColor=white)
![Language](https://img.shields.io/badge/Language-Groovy-4298B8?logo=apache-groovy&logoColor=white)
![Testing Type](https://img.shields.io/badge/Testing-Web_Automation-orange)
![Pattern](https://img.shields.io/badge/Pattern-Keyword_Driven-yellow)
![Data Driven](https://img.shields.io/badge/Data-Driven_Testing-green)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)

---

## 📌 Overview

Repository ini merupakan **portofolio automation testing** berbasis web menggunakan **Katalon Studio**.
Project ini mendemonstrasikan kemampuan dalam merancang dan mengimplementasikan automation framework
dengan pendekatan **Keyword-Driven** dan **Data-Driven Testing**, mencakup skenario end-to-end
pada aplikasi web enterprise.

---

## 🎯 Test Scenarios

| No | Test Case ID | Deskripsi Skenario | Type | Status |
|----|-------------|-------------------|------|--------|
| 1 | TC-Web-001 | Login dengan kredensial valid | Positive | ✅ Pass |
| 2 | TC-Web-002 | Navigasi menu dan verifikasi tampilan dashboard | Positive | ✅ Pass |
| 3 | TC-Web-003 | Eksekusi scheduler dan verifikasi notifikasi | Positive | ✅ Pass |
| 4 | TC-Web-004 | Pencarian data dengan input dari Data Files (Excel) | Data-Driven | ✅ Pass |
| 5 | TC-Web-005 | Verifikasi log process event pada BIS Process Monitor | Positive | ✅ Pass |
| 6 | TC-Web-006 | Download file attachment dan verifikasi konten | Positive | ✅ Pass |
| 7 | TC-Web-007 | Switch window dan verifikasi tampilan file log | Positive | ✅ Pass |

---

## 🛠️ Tech Stack

| Kategori | Detail |
|----------|--------|
| **Automation Tool** | Katalon Studio 10.1 |
| **Programming Language** | Groovy |
| **Browser** | Google Chrome (latest) |
| **Design Pattern** | Keyword-Driven Testing |
| **Test Approach** | Data-Driven Testing (Excel) |
| **Version Control** | Git & GitHub |
| **Test Artifact** | Test Cases, Test Suites, Custom Keywords, Object Repository |

---

## 📁 Project Structure

```
katalon-web-automation-portfolio/
│
├── 📂 Test Cases/              # Skenario pengujian end-to-end
├── 📂 Test Suites/             # Kumpulan & pengelompokan test suite
├── 📂 Keywords/                # Custom keywords (reusable functions)
│   ├── FileDownloader.groovy   # Keyword untuk proses download file
│   └── SFTP.groovy             # Keyword untuk interaksi SFTP
├── 📂 Object Repository/       # Lokator elemen UI (terstruktur per menu)
├── 📂 Data Files/              # Test data (format Excel .xlsx)
├── 📂 Profiles/                # Konfigurasi environment & global variables
├── 📂 Screenshot/              # Bukti hasil eksekusi test
└── 📂 Scripts/                 # Script pendukung
```

---

## ✨ Key Features & Highlights

- ✅ **Custom Keyword Architecture** — logika reusable dipisah dari test case untuk maintainability
- ✅ **Data-Driven Testing** — test case membaca input dari file Excel, mendukung banyak data sekaligus
- ✅ **File Download Handling** — keyword khusus untuk handle download file otomatis via Chrome
- ✅ **Dynamic XPath** — penggunaan XPath yang fleksibel dengan `contains`, `ancestor`, dan `following`
- ✅ **Multi-window Handling** — otomatis switch tab/window saat diperlukan
- ✅ **Screenshot on Key Steps** — bukti visual otomatis di setiap checkpoint penting
- ✅ **Structured Object Repository** — lokator UI diorganisir per halaman/menu

---

## ⚙️ Prerequisites

Pastikan tools berikut sudah terinstall sebelum menjalankan project ini:

- [Katalon Studio 10.1](https://katalon.com/download)
- Google Chrome (versi terbaru)
- Java 8 atau lebih tinggi

---

## 🚀 How to Run

### 1. Clone Repository
```bash
git clone https://github.com/AchmadSyah27/katalon-web-automation-portfolio.git
```

### 2. Buka di Katalon Studio
```
File → Open Project → pilih folder hasil clone
```

### 3. Set Execution Profile
```
Profiles/default.glbl → sesuaikan nilai:
- urlInternal  : [URL aplikasi target]
- username     : [username login]
- password     : [password login]
```

### 4. Jalankan Test Suite
```
Test Explorer → Test Suites → klik kanan → Run
```

---

## 📊 Test Execution Result

> Screenshot hasil eksekusi tersedia di folder `Screenshot/`

| Metric | Value |
|--------|-------|
| Total Test Cases | 7 |
| Passed | 7 |
| Failed | 0 |
| Pass Rate | 100% |

---

## 👤 About the Author

**Achmad Syah Hidayat**
QA Engineer dengan 9+ tahun pengalaman di industri perbankan dan multifinance.

Spesialisasi:
- Web & Mobile Automation Testing
- API Testing
- Test Strategy & Planning
- Defect Management

🔗 [LinkedIn](https://linkedin.com/in/achmadsyahhidayat) • 📧 achmadsyah@email.com

---

## 📄 License

This project is created for portfolio purposes.

---
