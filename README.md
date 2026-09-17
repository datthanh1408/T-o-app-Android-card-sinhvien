# 🪪 Ứng dụng Thẻ Sinh Viên (Student Profile Card) - Android

Ứng dụng Android Card Sinh Viên hỗ trợ quản lý và hiển thị thông tin cá nhân sinh viên, điểm trung bình tích lũy (GPA) cùng xếp loại học lực tương ứng.

---

## 👨‍🎓 Thông tin Sinh viên
- **Họ và tên:** Võ Văn Thành Đạt
- **MSSV:** 2415053122204
- **Email:** Anhhungbodon@gmail.com

---

## ✨ Tính năng chính
- 🎴 **Hiển thị thẻ sinh viên:** Họ tên, Mã số sinh viên (MSSV), Lớp học, Email liên hệ.
- 📊 **Tính toán Xếp loại Học lực:** Tự động quy đổi điểm GPA (hệ 4.0) sang xếp loại học lực (Xuất sắc, Giỏi, Khá, Trung bình...).
- ✏️ **Cập nhật GPA linh hoạt:** Cho phép nhập và cập nhật GPA mới trực tiếp với kiểm định dữ liệu hợp lệ (0.0 - 4.0).
- 🔔 **Thông báo Toast:** Hiển thị thông báo phản hồi thao tác người dùng nhanh chóng.

---

## 🛠️ Công nghệ sử dụng
- **Ngôn ngữ:** Kotlin
- **Giao diện & UI:** ViewBinding, ConstraintLayout, Material Components
- **Build System:** Gradle (Kotlin DSL - `build.gradle.kts`) & Version Catalog (`libs.versions.toml`)
- **Min SDK:** 24 (Android 7.0 trở lên)

---

## 🚀 Hướng dẫn Chạy dự án

### 1. Clone dự án về máy:
```bash
git clone https://github.com/datthanh1408/T-o-app-Android-card-sinhvien.git
```

### 2. Mở bằng Android Studio:
- Chọn **Open** -> Chọn thư mục `StudentProfileCard`.
- Đợi Android Studio tự động đồng bộ Gradle (Gradle Sync).

### 3. Khởi chạy:
- Kết nối máy ảo Android (Emulator) hoặc thiết bị thật (đã bật USB Debugging).
- Nhấn phím **Shift + F10** hoặc bấm biểu tượng **Run ▶️**.
