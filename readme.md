
# Desgin pattern 

 là các giải pháp điển hình cho các vấn đề thường gặp trong thiết kế phần mềm. Chúng giống như các bản thiết kế có thể được điều chỉnh để giải quyết một vấn đề cụ thể trong mã của bạn. Sử dụng các mẫu thiết kế có thể tăng tốc quá trình phát triển phần mềm bằng cách cung cấp các mô hình phát triển đã được thử nghiệm và chứng minh

## 1. Strategy pattern 

**Ví dụ:** sử dụng trong việc xử lý thanh toán bằng các phương thức thanh toán khác nhau (ví dụ: Thẻ tín dụng, PayPal, Ví điện tử).

## 2. Observer pattern 

**Ví dụ:** Việc theo dõi trạng thái của một dịch vụ giao hàng. Chúng ta sẽ có một dịch vụ giao hàng và nhiều người dùng theo dõi trạng thái đơn hàng của họ.

## 3. Facade pattern 

**Ví dụ:** Bạn muốn một hệ thống nhà thông minh có thể điều khiển đèn, điều hòa nhiệt độ, hệ thống an ninh, và hệ thống âm thanh. Mỗi hệ thống này có giao diện và cách thức hoạt động riêng biệt, khiến việc điều khiển toàn bộ ngôi nhà trở nên phức tạp. 

Facade pattern sẽ cung cấp một giao diện đơn giản để điều khiển toàn bộ ngôi nhà thông minh thông qua một lớp Facade duy nhất.

## 4. Prototype pattern 

**Ví dụ:** Trong một hệ thống quản lý tài liệu, có nhiều loại tài liệu khác nhau như báo cáo, hợp đồng, thư từ, v.v. Mỗi loại tài liệu có các thuộc tính và định dạng riêng. Khi tạo mới một tài liệu, người dùng thường cần một bản mẫu (template) để tiết kiệm thời gian và đảm bảo tính nhất quán.

Sử dụng Prototype pattern, bạn có thể tạo các bản mẫu cho từng loại tài liệu. Khi cần tạo một tài liệu mới, bạn chỉ cần sao chép (clone) bản mẫu đó và sau đó thay đổi các nội dung cụ thể nếu cần.

## 5. Adapter pattern 

**Ví dụ:** Tạo ra một lớp Adapter để điều chỉnh hoặc chuyển đổi độ phân giải của giao diện người dùng sao cho phù hợp với các thiết bị mới mà không cần phải thay đổi quá nhiều mã nguồn trong các thành phần giao diện hiện có.

## 6. factory pattern

**Ví dụ:** Bạn đang phát triển một ứng dụng quản lý sản xuất đồ chơi, trong đó có nhiều loại đồ chơi khác nhau cần được sản xuất. Mỗi loại đồ chơi có những đặc điểm và tính năng riêng biệt.

## 7. proxy  pattern

**Ví dụ:** Trong một công ty, mạng nội bộ của họ có nhiều tài nguyên quan trọng như cơ sở dữ liệu, máy chủ lưu trữ, hoặc dịch vụ web. Việc quản lý và bảo vệ quyền truy cập vào các tài nguyên này là rất quan trọng. Proxy pattern có thể được sử dụng để kiểm soát và giám sát các truy cập này một cách an toàn.

## 8. builder pattern

**Ví dụ:** Bạn là một nhà thầu xây dựng. Khách hàng của bạn có yêu cầu chi tiết về cấu trúc và thiết kế của căn nhà.

Bạn sử dụng Builder pattern để xây dựng căn nhà một cách có cấu trúc và linh hoạt. Mỗi phần của căn nhà (như phòng ngủ, phòng khách, bếp...)  có thể được xây dựng và tuỳ chỉnh độc lập, sau đó được kết hợp lại để tạo thành một sản phẩm hoàn chỉnh.