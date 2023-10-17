public int findRoot(int n, int[] left, int[] right) {
    Set<Integer> children = new HashSet<>();
    for (int node : left) {
        children.add(node);
    }
    
    for (int node : right) {
        children.add(node);
    }
    
    for (int i = 0; i < n; i++) {
        if (!children.contains(i)) {
            return i;
        }
    }
    
    return -1;
}
