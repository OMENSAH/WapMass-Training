class Animal {
    protected String name;
    protected boolean hasFur;

    protected void cry(){
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setFur(boolean hasFur){
        this.hasFur = hasFur;
    }

    protected String getName() {
        return this.name;
    }

    protected boolean checkHasFur(){
        return this.hasFur;
    }
}