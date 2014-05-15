package cn.xuebing.pattern.composite.example1;

public class LeafCompany extends Company {

    public LeafCompany(String name, Integer level) {
        super(name, level);
    }

    @Override
    public void addCompany(Company company) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void removeCompany(Company company) {
        throw new UnsupportedOperationException();
    }
}
