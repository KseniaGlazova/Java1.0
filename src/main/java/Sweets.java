public class Sweets {

        String name;
        int weight;
        int price;
        String additionalInfo;

        public Sweets (String name, int weight, int price, String additionalInfo){
            this.name = name;
            this.weight = weight;
            this.price = price;
            this.additionalInfo = additionalInfo;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        public void setPrice(){
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public void setAdditionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
        }

        public String getAdditionalInfo() {
            return additionalInfo;
        }
    }

