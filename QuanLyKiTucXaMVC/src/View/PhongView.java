/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.PhongDAO;
import Model.PhongModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phamd
 */
public class PhongView extends javax.swing.JFrame {

    
      int selectedIndex;
    public int edit;
    int delete;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private List<PhongModel> quanlyphong;
    private List<PhongModel> tkquanlyphong;
    private List<PhongModel> checkmaphong;
    private DefaultTableModel model;
    /**
     * Creates new form PhongView
     */
    public PhongView() {
        initComponents();
        this.setLocationRelativeTo(null);
         model=(DefaultTableModel)Banghienthi.getModel();
        showTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        Banghienthi = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaphong = new javax.swing.JTextField();
        txtGiaphong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSonguoihientai = new javax.swing.JTextField();
        txtSonguoitoida = new javax.swing.JTextField();
        jRadioNam = new javax.swing.JRadioButton();
        jRadioNu = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jComboTinhtrang = new javax.swing.JComboBox<>();
        txtMota = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtTimkiem = new javax.swing.JButton();
        txtTimkiemP = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnLammoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Banghienthi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã phòng", "Loại phòng", "Giá phòng", "Tinhtrang", "Số người ở HT", "Số người ở TĐ", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Banghienthi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BanghienthiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Banghienthi);

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 204));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Danh sách phòng");

        jPanel3.setBackground(new java.awt.Color(214, 217, 223));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã phòng:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Loại phòng:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Giá phòng:");

        txtMaphong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtGiaphong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Số người hiện tại:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Số người tối đa:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mô tả:");

        txtSonguoihientai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtSonguoitoida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        buttonGroup1.add(jRadioNam);
        jRadioNam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioNam.setText("Nam");

        buttonGroup1.add(jRadioNu);
        jRadioNu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioNu.setText("Nữ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Tình trạng:");

        jComboTinhtrang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboTinhtrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn trống", "Đã hết", " " }));

        txtMota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioNam, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioNu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtGiaphong, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMaphong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboTinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSonguoitoida)
                                .addComponent(txtSonguoihientai, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtMota, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSonguoihientai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSonguoitoida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboTinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioNam)
                                    .addComponent(jRadioNu)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(txtGiaphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(214, 217, 223));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTimkiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Search.png"))); // NOI18N
        txtTimkiem.setText("Tìm kiếm");

        txtTimkiemP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(txtTimkiemP, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTimkiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimkiemP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimkiem))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Exit.png"))); // NOI18N
        btnThoat.setText("Thoát");

        btnLammoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_refresh_30px.png"))); // NOI18N
        btnLammoi.setText("Làm mới");
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnLammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnThoat)
                    .addComponent(btnLammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if(txtMaphong.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã phòng");
              txtMaphong.requestFocus();
              return;
        }
      
        if(txtGiaphong.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập giá phòng");
             txtGiaphong.requestFocus();
              return;
        }
        if(txtSonguoihientai.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập số người ở hiện tại");
             txtSonguoihientai.requestFocus();
              return;
        }
        if(txtSonguoitoida.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập số người tối đa ");
             txtSonguoitoida.requestFocus();
              return;
        }
        if(txtMota.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mô tả về phòng");
             txtMota.requestFocus();
              return;
        }
        int ht=Integer.parseInt(txtSonguoihientai.getText());
                int dt=Integer.parseInt(txtSonguoitoida.getText());
                if(ht>dt){
                      JOptionPane.showMessageDialog(this, "Số người hiện tại phải nhỏ hơn số người tối đa");
                       txtSonguoihientai.requestFocus();
                        return;
                }
            PhongModel p=new PhongModel();

                 p.setMap(txtMaphong.getText());
                 String lp="";
                 if (jRadioNam.isSelected()) {
                     lp="Nam";
                 }else{
                     lp="Nữ";
                 }
                p.setLoaiphong(lp);
               
                boolean isNXB=true;
                try {
                        p.setGiaphong(Double.parseDouble(txtGiaphong.getText()));

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Giá tiền chỉ là số ko phải là kí tự");
                        txtGiaphong.requestFocus();
                        isNXB=false;
                        return;
                       
                    }
                 p.setTinhtrang(jComboTinhtrang.getSelectedItem().toString());
                try {
                       p.setSonguoio(Integer.parseInt(txtSonguoihientai.getText()));

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Số người ở hiện tại chỉ là số ko phải là kí tự");
                        txtSonguoihientai.requestFocus();
                        isNXB=false;
                        return;
                    }
                try {
                        p.setSoluongtd(Integer.parseInt(txtSonguoitoida.getText()));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Số người ở tối đa chỉ là số ko phải là kí tự");
                         txtSonguoitoida.requestFocus();
                        isNXB=false;
                        return;
                    }
                
                p.setMota(txtMota.getText());
               if(isNXB){
                 checkmaphong= new PhongDAO().CheckMap(txtMaphong.getText());
                 System.out.println("ArrayList: " + checkmaphong);
                 int size = checkmaphong.size();
                    if(size== 0){
                        new PhongDAO().ThemPhong(p);
                         showTable();
                         JOptionPane.showMessageDialog(this, "Thêm thành công");
                         XoaTrang();
                    }else{
                         JOptionPane.showMessageDialog(rootPane, "Mã phòng này đã tồn tại");
                    }
               }
           
        
           
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void BanghienthiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BanghienthiMouseClicked
        // TODO add your handling code here:
        txtMaphong.setEditable(false);
        selectedIndex=Banghienthi.getSelectedRow();
        PhongModel p= quanlyphong.get(selectedIndex);
       
        txtMaphong.setText(p.getMap());
       
        String lp=p.getLoaiphong();
        if(lp.equals("Nam")){
            jRadioNam.setSelected(true);
        }else{
            jRadioNu.setSelected(true);
        }
        jComboTinhtrang.setSelectedItem(p.getTinhtrang());
        txtGiaphong.setText(Math.round(p.getGiaphong())+"");
        txtSonguoihientai.setText(p.getSonguoio()+"");
        txtSonguoitoida.setText(p.getSoluongtd()+"");
        txtMota.setText(p.getMota());
    }//GEN-LAST:event_BanghienthiMouseClicked

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        // TODO add your handling code here:
        XoaTrang();
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
         txtGiaphong.setEditable(true);
        edit = Banghienthi.getSelectedRow();
        PhongModel p = quanlyphong.get(selectedIndex);
        if (quanlyphong.size() > 0) {
            if (edit != -1) {
                   
                   
                 p.setMap(txtMaphong.getText());
                 String lp="";
                 if (jRadioNam.isSelected()) {
                     lp="Nam";
                 }else{
                     lp="Nữ";
                 }
                p.setLoaiphong(lp);
               
                boolean isNXB=true;
                try {
                        p.setGiaphong(Double.parseDouble(txtGiaphong.getText()));

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Giá tiền chỉ là số ko phải là kí tự");
                        txtGiaphong.requestFocus();
                        isNXB=false;
                        return;
                       
                    }
                 p.setTinhtrang(jComboTinhtrang.getSelectedItem().toString());
                try {
                       p.setSonguoio(Integer.parseInt(txtSonguoihientai.getText()));

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Số người ở hiện tại chỉ là số ko phải là kí tự");
                        txtSonguoihientai.requestFocus();
                        isNXB=false;
                        return;
                    }
                try {
                        p.setSoluongtd(Integer.parseInt(txtSonguoitoida.getText()));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Số người ở tối đa chỉ là số ko phải là kí tự");
                         txtSonguoitoida.requestFocus();
                        isNXB=false;
                        return;
                    }
                p.setMota(txtMota.getText());
               
                        new PhongDAO().SuaPhong(p);
                         showTable();
                         JOptionPane.showMessageDialog(this, "Sửa thành công");
                         XoaTrang();
                      
                   

                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn sách cần sinh sửa");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Danh sách rỗng");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
          txtMaphong.setEditable(true);
        delete=Banghienthi.getSelectedRow();
        PhongModel p=quanlyphong.get(selectedIndex);
        if (quanlyphong.size() > 0) {
            if (delete!= -1) {
                int choic = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xóa?");
                if (choic == JOptionPane.YES_OPTION) {
                    new PhongDAO().XoaPhong(p.getMap());
                    showTable();
                    XoaTrang();
                    JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Bạn đã hủy");
                    XoaTrang();
                    showTable();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn sách cần xóa");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Danh sách rỗng");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhongView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Banghienthi;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboTinhtrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioNam;
    private javax.swing.JRadioButton jRadioNu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtGiaphong;
    private javax.swing.JTextField txtMaphong;
    private javax.swing.JTextField txtMota;
    private javax.swing.JTextField txtSonguoihientai;
    private javax.swing.JTextField txtSonguoitoida;
    private javax.swing.JButton txtTimkiem;
    private javax.swing.JTextField txtTimkiemP;
    // End of variables declaration//GEN-END:variables

     private void showTable() {
     quanlyphong=new PhongDAO().getListPhong();
     model.setRowCount(0);
   
     for(PhongModel s:quanlyphong){
          System.err.println(s);
         model.addRow(new Object[]{
             Banghienthi.getRowCount()+1,s.getMap(),s.getLoaiphong(),s.getGiaphong(),s.getTinhtrang(),s.getSonguoio(),s.getSoluongtd(),s.getMota(),
        });
         
     }
    
    }
    private void XoaTrang(){
        txtMaphong.setText("");
         jRadioNam.setSelected(true);
        txtGiaphong.setText("");
       
        jComboTinhtrang.setSelectedIndex(0);
        txtSonguoihientai.setText("");
        txtSonguoitoida.setText("");
        txtMota.setText("");
        showTable();
    }

}
