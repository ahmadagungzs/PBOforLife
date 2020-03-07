 public class Dosen extends Orang
    {
        private String mk;
        private String strata;
        private int salary; // Nilai salary harus lebih dari 0

        public Dosen(String nama, String alamat, String kota, int umur, char jenis_kelamin, String mk, String strata, int salary) {

            this.mk=mk;
            this.strata=strata;
            this.salary=salary;
        }
        public void yaudalah() {
            setnama();
            setalamat();
            setkota();
            setumur();
            setjenis_kelamin();
        }

        public void setStrata(String strata) {
            this.strata=strata;
        }
        public void setMk(String tittle) { }
        public void setSalary(int salary) { }
        @Override
        public String toString()
        {
        /*
            Mengembalikan informasi dosen
         */
            return "MK : " + mk + "\n" + "Strata : " + strata + "\n" + "Salary : " + salary ;
        }
    }
