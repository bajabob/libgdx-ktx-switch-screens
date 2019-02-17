package com.bajabob.ktx

import ktx.app.KtxScreen
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.Align
import com.badlogic.gdx.utils.viewport.ScreenViewport
import ktx.scene2d.label
import ktx.scene2d.table


class TitleScreen: KtxScreen {

    val stage by lazy { Stage(ScreenViewport()) }

    override fun show() {
        super.show()

        val root = table {
            setFillParent(true)
            label("hello world") {
                setAlignment(Align.center)
            }.cell(colspan = 2, fillX = true)
        }

        Gdx.input.setInputProcessor(stage)
        stage.addActor(root)
    }




    override fun render(delta: Float) {
        super.render(delta)
        Gdx.gl.glClearColor(0f, 0f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        stage.act()
        stage.draw()
    }
}