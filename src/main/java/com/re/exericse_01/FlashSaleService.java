package com.re.exericse_01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlashSaleService {

    // Khởi tạo Logger từ SLF4J
    private static final Logger logger = LoggerFactory.getLogger(FlashSaleService.class);

    public void applyDiscount(String userId, String code) {
        // Thay System.out bằng logger.info, sử dụng {} để truyền biến
        logger.info("Đang xử lý mã: {} cho user: {}", code, userId);

        try {
            // ... logic nghiệp vụ

            logger.info("Áp dụng thành công mã: {} cho user: {}", code, userId);
        } catch (Exception e) {
            // Thay e.printStackTrace() bằng logger.error, truyền nguyên object 'e' vào cuối cùng
            logger.error("Lỗi khi xử lý mã: {} cho user: {}", code, userId, e);
        }
    }
}