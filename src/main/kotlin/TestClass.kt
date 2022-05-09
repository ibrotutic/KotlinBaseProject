import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlin.coroutines.CoroutineContext

class TestClass(
    private val initialAmount: Int
): CoroutineScope  {

    val flow = MutableStateFlow(false)

    init {
        launch {
            withContext(Dispatchers.IO) {
                delay(5000)
                flow.emit(true)
                System.out.println("Emitting")
            }
        }
    }

    fun getInitial(): Int {
        return initialAmount
    }

    override val coroutineContext: CoroutineContext
        get() = SupervisorJob()
}