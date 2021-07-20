# Binary_or_Text_Java
バイナリファイルかテキストファイルかを判定する。

## 実行

``` sh
mvn clean compile 
mvn exec:java -Dexec.mainClass="sample.binarytotext.App" -Dexec.args="'${PWD}/src/main/java/sample/binaryortext/App.java'"
mvn exec:java -Dexec.mainClass="sample.binarytotext.App" -Dexec.args="'${PWD}/target/classes/sample/binaryortext/App.class'"
```

## 参考

- [\[Java\] テキストファイルかどうかを判別する:プロプログラマー](https://propg.ee-mall.info/%E3%83%97%E3%83%AD%E3%82%B0%E3%83%A9%E3%83%9F%E3%83%B3%E3%82%B0/java/java-%E3%83%86%E3%82%AD%E3%82%B9%E3%83%88%E3%83%95%E3%82%A1%E3%82%A4%E3%83%AB%E3%81%8B%E3%81%A9%E3%81%86%E3%81%8B%E3%82%92%E5%88%A4%E5%88%A5%E3%81%99%E3%82%8B/)

