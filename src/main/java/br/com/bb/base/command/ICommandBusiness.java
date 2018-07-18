package br.com.bb.base.command;

/**
 *
 * @param <I> Incoming parameter
 * @param <O> Outgoing response
 */
public interface ICommandBusiness<I, O> {

    O execute(I i);

}
