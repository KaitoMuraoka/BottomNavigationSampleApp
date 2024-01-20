# BottomNavigationSampleApp

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


### 解決方針
- [ ] Bottom Navigation のボタンから画面が切り替わるようにしたい。

### 仮説
- この記事は「Bottom Navigation」の**表示**であり、実装ではないのでは？→画面遷移機能は別に作る必要がある。
