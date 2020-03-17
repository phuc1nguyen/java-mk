//// Day la mot doi tuong chuc nang
//
//package week3.day5.a51;
//
//public class QLCB implements QLCBinterface {
//
//    @Override
//    public CanBo themMoiCanBo(String name, int age, String gender, String add){
//        CanBo cb = new CanBo();
//        cb.setHoTen(name);
//        cb.setTuoi(age);
//        cb.setGioiTinh(gender);
//        cb.setDiaChi(add);
//        return cb;
//    }
//
//    @Override
//    public CanBo timKiemTheoHoTen(String name, CanBo[] cbList) {
//        for(CanBo cb: cbList){
//            if(cb:getHoTen().equals(name)){
//                return cb;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void hienThiDanhSachCanBo(CanBo[] cbList){
//        for (CanBo cb: cbList){
//            if (cb != null) {
//                System.out.println(cb.getHoTen());
//            }
//        }
//    }
//}
