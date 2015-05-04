
# Se da la opcion a pasar un Hash, para combinar metodos de clasificacion.
def clasificar_tropes_usando_generos(generos, hash = Hash.new(GENERO_DESCONOCIDO))
  generos.each do |genero|
    genero.tropes.each do |trope|
      if hash[trope] != valor_defecto
        puts "Se intento #{trope} => #{genero.nombre}, cuando ya => #{hash[trope]}"
      else
        hash[trope] = genero.nombre
      end
    end
  end
  return hash
end
