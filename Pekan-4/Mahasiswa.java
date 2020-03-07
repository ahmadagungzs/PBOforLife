 public class Mahasiswa extends Orang {

        private String NIP;
        private String kelas;
        private int semester;
        private MahasiswaReport report;

        public Mahasiswa(String nama, String alamat, String kota, int umur, char jenis_kelamin, String NIP, String kelas, int semester, MahasiswaReport Report) {
                this.report=getReport();
        }
        public void setId(String id) { }
        public void setkelas(String kelas) { }
        public void setSemester(int semester) { }
        public void setReport(MahasiswaReport report) { }
        public String getNIP() {
            return "";
        }
        public String getkelas()
        {
            return "";
        }
        public int getSemester()
        {
            return 0;
        }
        public MahasiswaReport getReport()
        {
            return report;
        }
        @Override
        public String toString()
        {
        /*
            Mengembalikan informasi mahasiswa
         */
            return "";
        }
}
