package br.com.braul.controller

import br.com.braul.entity.Client
import br.com.braul.service.ClientService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/clients")
class ClientController(private val clientService: ClientService) {

    @PostMapping("/save")
    fun create(@RequestBody client: Client){
        clientService.saveClient(client)
    }

    @GetMapping
    fun getAllClients(): List<Client>{
        return clientService.getAll()
    }
}