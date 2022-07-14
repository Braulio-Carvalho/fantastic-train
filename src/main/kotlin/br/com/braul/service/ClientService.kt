package br.com.braul.service

import br.com.braul.entity.Client
import br.com.braul.repository.ClientRepository
import org.springframework.stereotype.Service

@Service
class ClientService(private val repository: ClientRepository) {

    fun saveClient(client: Client){
        repository.save(client)
    }

    fun getAll(): List<Client>{
      return repository.findAll()
    }
}