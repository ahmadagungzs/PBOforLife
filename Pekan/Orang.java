public class Orang {

        private String nama;
        private String alamat;
        private String kota;
        private int umur;
        private String jenis_kelamin;

        void setnama(String nama) {
            this.nama=nama;
        }
        void setalamat(String alamat) {
            this.alamat=alamat;
        }
        void setkota(String kota) {
            this.kota=kota;
        }
        void setumur(int umur) {
            this.umur=umur;
        /*
            Umur harus lebih dari 0
         */
        }
        void setjenis_kelamin(String jenis_kelamin) {
          /*  if (jenis_kelamin=='L'|| jenis_kelamin=='l') {
                this.jenis_kelamin = "laki-laki";
            } else if (jenis_kelamin=='P' || jenis_kelamin=='p') {
                this.jenis_kelamin = "perempuan";
            }*//*
            Validasi bahawa karakter jenis kelamin adalah
            L: laki-laki dan
            P: perempuan
         */
        }String getnama() {
            return this.nama;
        }
        String getalamat() {
            return this.alamat;
        }
        String getkota() {
            return this.kota;
        }
        int getumur() {
            return this.umur;
        }
        String getjenis_kelamin() {
            return this.jenis_kelamin;
        }
        public String toString() {
        /*
            Mengembalikan informasi identitas orang
         */
            return "Nama :" + this.nama + "\n" + "Alamat : " + this.alamat + "\n" + "Kota : " + this.kota + "\n" + "umur : " + this.umur + "\n" + "Jenis kelamin : " + this.jenis_kelamin + "\n";
        }
}
