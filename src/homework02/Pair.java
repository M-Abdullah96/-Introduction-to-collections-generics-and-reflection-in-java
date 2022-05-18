package homework02;
public class Pair {
    String url;
    String data;
public Pair(String url, String data) {
        this.url = url;
        this.data = data;
        }

public String getUrl() {
        return url;
        }

public String getData() {
        return data;
        }

public void setUrl(String url) {
        this.url = url;
        }

public void setData(String data) {
        this.data = data;
        }

@Override
public boolean equals(Object object) {
        Pair pair = (Pair) object;
        return pair.getUrl().contentEquals(url);
        }

@Override
public String toString() {
        return "Pair: ["+url+","+data+"]";
        }
        }

