package br.com.wagneraraujo.componentesaplicacao

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import br.com.wagneraraujo.componentesaplicacao.NotificationService

class AlarmeReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, NotificationService::class.java)
        service.putExtra("MSG", "Teste Wagner")
        service.putExtra("MSG2", intent?.getStringExtra("MSG2"))
        context?.startService(service)
    }
}