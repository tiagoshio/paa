void nSteps(int n, List<Integer> path, List<List<Integer>> res) {
    if(n == 0) {
        res.add(new ArrayList<>(path));
        return;
    }

    if(n < 0) {
        return;
    }

    path.add(1);
    nSteps(n - 1, path, res);
    path.removeLast();

    path.add(2);
    nSteps(n - 2, path, res);
    path.removeLast();
}

void main() {
    int n = 4;

    List<List<Integer>> result = new ArrayList<>();

    nSteps(n, new ArrayList<>(), result);

    for(int i = 0; i < n; i++) {
        IO.println(result.get(i));
    }
}
