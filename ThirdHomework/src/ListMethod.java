class ListMethod {

    int[] lstV;

    /**
     * @param lst shoud reveive some non-empty list of integers
     * @return return integer summ of all values in the list
     */
    int countSum(int lst[]) {
        int sum = 0;
        for (int aLst : lst) {
            sum += aLst;
        }
        return sum;
    }

    /**
     * @param lst shoud reveive some non-empty list of integers
     * @return integer lenght of the list
     */

    int countlengh(int lst[]) {
        int lengh = 0;
        for (int i = 1; i <= lst.length; i++) {
            lengh = i;
        }
        return lengh;
    }

    /**
     * @param lst lst shoud reveive some non-empty list of integers
     * @return integer avarage number of lst
     */

    int countAvarage(int lst[]) {
        return countSum(lst) / countlengh(lst);
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
        result = prime * result + countSum(this.lstV);
        result = prime * result + countAvarage(lstV);
        result = prime * result + countlengh(lstV);
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




