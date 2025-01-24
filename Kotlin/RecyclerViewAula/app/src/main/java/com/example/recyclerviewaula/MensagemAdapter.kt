package com.example.recyclerviewaula
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MensagemAdapter(  private val lista: List<Mensagem>): RecyclerView.Adapter<MensagemAdapter.MensagemViewHolder>() {

    inner class MensagemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textNome: TextView = itemView.findViewById(R.id.text_nome)
        val textUltima: TextView = itemView.findViewById(R.id.text_ultima)
        val textHorario: TextView = itemView.findViewById(R.id.text_horario)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.item_lista, parent, false)  // attach to root próprio recycler view usamos false

        return MensagemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
        val mensagem = lista[position]
        holder.textNome.text = mensagem.mensagem
        holder.textHorario.text = mensagem.horario
        holder.textUltima.text = mensagem.ultima

    }

    override fun getItemCount(): Int {
        return lista.size
    }
    // ao vincular o viewHolder com os dados


}