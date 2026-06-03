### 3 lý do tuyệt đối không dùng System.out.println() trên Production:

1. **Không lưu trữ và khó tra cứu (No Persistence):** `System.out.println()` chỉ in dữ liệu ra màn hình Console (standard output). Khi server bị crash hoặc khởi động lại, toàn bộ log sẽ bốc hơi. Dev không có file log để tra cứu lại lịch sử lỗi.
2. **Gây nghẽn hiệu năng (Performance Bottleneck):** Lệnh in này hoạt động theo cơ chế đồng bộ (synchronous) và có tính chất chặn (blocking). Trong các nghiệp vụ chịu tải cao như Flash Sale, việc in liên tục ra màn hình sẽ khóa luồng thực thi, làm chậm toàn bộ hệ thống.
3. **Thiếu ngữ cảnh và cấp độ phân loại (Lack of Context & Levels):** Nó chỉ in ra đoạn text đơn thuần mà không kèm theo thời gian (timestamp), tên luồng (thread), hay tên class đang chạy. Ngoài ra, không thể phân loại log theo mức độ (INFO, DEBUG, WARN, ERROR) để lọc và cấu hình cảnh báo."# Ss09_Ex_1" 
