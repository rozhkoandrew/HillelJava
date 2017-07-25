class ListMethod<T extends Number> {

    T [] lstV;


    ListMethod(T [] l){
        this.lstV = l;

    }

    /**
     * @return return integer summ of all values in the list
     */
    int countSum() {
        double sum = 0;
        for (T aLst : this.lstV) {
             sum += aLst;
        }
        return  sum;
    }

    /**
     * @return integer lenght of the list
     */

    int countlengh() {
        int lengh = 0;
        for (int i = 1; i <= this.lstV.length; i++) {
            lengh = i;
        }
        return lengh;
    }

    /**
     * @return integer avarage number of lst
     */

    int countAvarage() {
        return countSum() / countlengh();
    }

    /**
     * Should be a ListMethod object type to have a LstV field inside
     * Overriding hashCOde() method
     *
     * @return hash code of list of integers.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + countSum();
        result = prime * result + countAvarage();
        result = prime * result + countlengh();
        return result;
    }

    /**
     * @param obj should be not null and have a ListMethod type
     * @return return boolean true if objects are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ListMethod other = (ListMethod) obj;
        return this.hashCode() == other.hashCode();
    }

}












