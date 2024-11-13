# Fill ViewPort 
* Utilizado para expandir a ViewPort ao usar um ScrowView
* Previnir erros relacionados à quantidade de objetos na viewport
* Exemplo:
```xml
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fillViewport="true">
     <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

     </androidx.constraintlayout.widget.ConstraintLayout>

</ScrollView>
```
# Parcelize Kotlin
* Utilizado para passar objetos dentro do android
* Nativo do Kotlin no Java usamos o Serializable
> Código para adicionar o kotlin-parcelize - build.grade.kts
```kts
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-parcelize")
}
```
> Exemplo parcelize
```kotlin
@Parcelize
data class Filme(
    var nome: String,
    var descricao: String,
    var avaliacoes: Double,
    var diretor: String,
    var distribuidora: String
) : Parcelable
```

> Inserir dados no parcelize
```kotlin
  val filme = Filme(
                "the walking dead",
                "filme de zumbi",
                5.00,
                "Scott M. Gimple",
                "teste de imagem"

            )
   intent.putExtra("filme", filme)
```
> Pegar os dados no parcelize na outra activity
```kotlin
   val bundle = intent.extras   // variável do tipo bundle que recebe os dados da intent
   var filme: Filme? = null     // variável do tipo filme
   // if para testar a versão do android
   if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
      //filme = bundle?.getSerializable("filme", Filme::class.java)
      filme = bundle?.getParcelable("filme", Filme::class.java)
   }else
      //filme = bundle?.getSerializable("filme") as Filme      // forma antigafilme = bundle?.getSerializable("filme") as Filme      // forma antiga
      filme = bundle?.getParcelable("filme")
   Toast.makeText(this, "Nome do filme: ${filme?.descricao}", Toast.LENGTH_SHORT).show()
```


# Fragments por código
* Criar fragments para o android
* Usado junto com as activity

> Fragment classe

```kotlin
class ConversasFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_conversas, container, false)
    }
}

```

> Criar xml do fragment; Botão esquerdo do mouse -> NEW -> DRAWABLE RESOURCE FILE

