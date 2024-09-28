package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Produto;

public class ProdutoResponseDto {
    private Long id;
	private String nome;
    private BigDecimal valor;
    private static final ModelMapper modelMapper = new ModelMapper();

    public ProdutoResponseDto toDto(Produto produto) {
        return modelMapper.map(produto, ProdutoResponseDto.class);

    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    

    

}
