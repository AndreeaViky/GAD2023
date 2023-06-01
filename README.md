# Factory
Au fost create 2 magazine de pizza, unul in Chicago si unul in NewYork, fiecare cu 2 tipuri de pizza, cu branza si cu salam, bazata pe o clasa abstracta PizzaStore.
Am folosit the Factory Method pentru a crea diferite tipuri de pizza, pentru fiecare magazin. 
Clasa PizzaStore e o interfata care se ocupa de crearea tipurilor de pizza.
Obiectul newYorkPizzaStore este creat ca o interfata a clasei NewYorkPizaStore, care extinde clasa abstracta PizzaStore. La fel si in cazul ChicagoPizzaStore.  

# Observer
In aceasta problema am realizat o agentie de stiri, unde orice persoana se poate abona.
Functia public void subscribe(Subscriber subscriber) este facuta pentru ca o persoana sa se poata abona, iar  public void unsubscribe(Subscriber subscriber) pentru a se dezabona.
Pentru momentul in care se publica un articol public void publishArticle(String articleTitle), abonatii vor primi o notificare private void notifySubscribers(String articleTitle).
