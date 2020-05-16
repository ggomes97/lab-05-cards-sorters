function love.load()
    love.graphics.setBackgroundColor(129/255, 129/255, 129/255, 0.8)
    card = love.graphics.newImage("assets/cards/cardBack_red4.png")
end


function love.draw()
    love.graphics.print('Hello World!', 400, 300)
    love.graphics.draw(card, 300, 200)
    love.graphics.rectangle("fill", 20, 50, 120, 40 )
end
