# BottomNavigationSampleApp

## 問題箇所
https://github.com/KaitoMuraoka/BottomNavigationSampleApp/blob/f99d567cf19f97d56b3c494b4501d383cabb2be4/app/src/main/java/com/example/bottomnavigationsampleapp/MainActivity.kt#L29-L54

## これは何？
Bottm Navigation の実装をしたいと思い、[Qiitaで記事](https://qiita.com/Nabe1216/items/b26b03cbc750ac70a842)を見てたが、画面遷移がされない問題が発生した。


置き換えについて学びたいので、記事内の[「Activityでの実装」の「これまでの実装」](https://qiita.com/Nabe1216/items/b26b03cbc750ac70a842#これまでの実装)を参考にしている。

```kotlin
class ExampleActivity : AppCompatActivity(R.layout.activity_example) {

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.settings -> {
                openSettings()
                true
            }
            R.id.help -> {
                showHelp()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
```
## 実現したいこと
- [ ] Bottom Navigation で、home, dashboard, notifications のFragment遷移をできるようにしたい。

## 実現するために自分がしたこと
- [Qiita](https://qiita.com/Nabe1216/items/b26b03cbc750ac70a842#これまでの実装) を参考
- Githubでのコード検索：`language:Kotlin  override fun onOptionsItemSelected(item: MenuItem): Boolean {         when(item.itemId) {             R.id` など
- Material Design の Bottom navigation を参照 : https://m2.material.io/components/bottom-navigation/android

## 原因と思われそうな箇所
`onCreateOptionsMenu` と `onOptionsItemSelected` メソッドは、Bottom navigation の表示だけで、画面遷移は別の処理を追加しなくてはいけない？→どうやって？
