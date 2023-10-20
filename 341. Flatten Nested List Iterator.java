public class NestedIterator implements Iterator<Integer> {

    private int pointer;
    private final List<Integer> values = new ArrayList<>();
    
    public NestedIterator(List<NestedInteger> nestedList) {
        fillValues(nestedList);
    }

    private void fillValues(List<NestedInteger> nestedList) {
        for (NestedInteger value : nestedList) {
            if (value.isInteger()) {
                values.add(value.getInteger());
            } else {
                fillValues(value.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return (values.get(pointer++));
    }

    @Override
    public boolean hasNext() {
        return values.size() > pointer;
    }
}
