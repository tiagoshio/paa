import dijkstra.Dijkstra;
import dijkstra.Graph;

void main() {

    Graph eg1 = new Graph(7);
    eg1.addEdge(0, 3, 4);
    eg1.addEdge(0, 4, 4);
    eg1.addEdge(0, 2 ,3);
    eg1.addEdge(1, 2, 2);
    eg1.addEdge(1, 5, 2);
    eg1.addEdge(2, 4, 4);
    eg1.addEdge(2, 6, 5);
    eg1.addEdge(2, 5, 5);
    eg1.addEdge(3, 4, 2);
    eg1.addEdge(4, 6, 5);
    eg1.addEdge(5, 6, 5);

    Dijkstra dijkstraEg1 = new Dijkstra(eg1);
    dijkstraEg1.resolve(3);

//    Graph eg2 = new Graph(5);
//    eg2.addEdge(0, 1, 4);
//    eg2.addEdge(0, 2, 8);
//    eg2.addEdge(1, 2, 3);
//    eg2.addEdge(1, 4, 6);
//    eg2.addEdge(2, 3, 2);
//    eg2.addEdge(3, 4, 10);
//
//    Dijkstra dijkstraEg2 = new Dijkstra(eg2);
////    dijkstraEg2.resolve(0);


}